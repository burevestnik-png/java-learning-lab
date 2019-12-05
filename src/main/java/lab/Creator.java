package lab;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import lab.exceptions.InjectorCreatingException;
import lab.object.Ground;
import lab.object.IObjectFactory;
import lab.object.tree.IPart.IPart;
import lab.object.tree.IPart.IPartFactory;
import lab.object.tree.IPart.LeafFactory;
import lab.subject.Tree;
import lab.subject.*;
import lab.object.Object;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Creator {
    private Map<String, Class<? extends Subject>> subjectMap = new HashMap<String, Class<? extends Subject>>() {
        {
         put("Bird", Bird.class);
         put("Skuperfield", Skuperfield.class);
         put("Wind", Wind.class);
         put("Flower", Flower.class);
         put("Rush", Rush.class);
    }
    };

    private Map<String, Class<? extends Object>> objectMap = new HashMap<String, Class<? extends Object>>() {
        {
            put("Ground", Ground.class);
        }
    };

    private Map<String, Class<? extends IPartFactory>> supportMap = new HashMap<String, Class<? extends IPartFactory>>() {
        {
            put("LeafFactory", LeafFactory.class);
        }
    };

    private Injector createInjectorForSubject(String configurationName)  {
        if (configurationName == null) {
            throw new InjectorCreatingException("Configuration name is null");
        }
        Class<? extends Subject> subjectClass = subjectMap.get(configurationName);
        return changeConfigurationToSubject(subjectClass);
    }

    private Injector createInjectorForObject(String configurationName) {
        if (configurationName == null) {
            throw new InjectorCreatingException("Configuration name is null");
        }
        Class<? extends Object> objectClass = objectMap.get(configurationName);
        return changeConfigurationToObject(objectClass);
    }

    private Injector createInjectorForIPartFactory(String configurationName) {
        if (configurationName == null) {
            throw new InjectorCreatingException("Configuration name is null");
        }
        Class<? extends IPartFactory> supportClass = supportMap.get(configurationName);
        return changeConfigurationToIPartFactory(supportClass);
    }

    private Injector changeConfigurationToSubject(Class<? extends Subject> subjectConcreteClass) {
        return Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                install(new FactoryModuleBuilder()
                        .implement(Subject.class, subjectConcreteClass)
                        .build(ISubjectFactory.class));
            }
        });
    }

    private Injector changeConfigurationToObject(Class<? extends Object> objectConcreteClass) {
        return Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                install(new FactoryModuleBuilder()
                        .implement(Object.class, objectConcreteClass)
                        .build(IObjectFactory.class));
            }
        });
    }

    private Injector changeConfigurationToIPartFactory(Class<? extends IPartFactory> supportConcreteClass) {
        return Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(IPartFactory.class).to(supportConcreteClass);
            }
        });
    }

    public MaterialObject createTree(List<IPart> parts, String name) {
        return new Tree(2, 2, 0, parts, name);
    }

    private ISubjectFactory createSubjectFactory(Injector injector) {
        return injector.getInstance(ISubjectFactory.class);
    }

    private IObjectFactory createObjectFactory(Injector injector) {
        return injector.getInstance(IObjectFactory.class);
    }

    private IPartFactory createIPartFactory(Injector injector) {
        return injector.getInstance(IPartFactory.class);
    }

    public MaterialObject createSubject(String configurationName) {
         Injector injector = createInjectorForSubject(configurationName);
         ISubjectFactory subjectFactory = createSubjectFactory(injector);
         return subjectFactory.create(0,0,0, configurationName);
    }

    public MaterialObject createObject(String configurationName) {
        Injector injector = createInjectorForObject(configurationName);
        IObjectFactory objectFactory = createObjectFactory(injector);
        return objectFactory.create(0,0,0, configurationName);
    }

    public List<IPart> createSupport(String configurationName)  {
         Injector injector = createInjectorForIPartFactory(configurationName);
         IPartFactory partFactory = createIPartFactory(injector);
         return partFactory.createParts();

    }
}