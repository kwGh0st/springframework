package kwgh0st.springframework.app04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorDependencyInjection {
    ConstructorDependencyOne constructorDependencyOne;
    ConstructorDependencyTwo constructorDependencyTwo;

    @Autowired
    public ConstructorDependencyInjection(ConstructorDependencyOne constructorDependencyOne, ConstructorDependencyTwo constructorDependencyTwo) {
        this.constructorDependencyOne = constructorDependencyOne;
        this.constructorDependencyTwo = constructorDependencyTwo;
    }

    @Override
    public String toString() {
        return "ConstructorDependencyInjection using: " + constructorDependencyOne + " " + constructorDependencyTwo;
    }
}
@Component
class ConstructorDependencyOne {
    @Override
    public String toString() {
        return "Text from ConstructorDependencyOne toString method";
    }
}
@Component
class ConstructorDependencyTwo {
    @Override
    public String toString() {
        return "Text from ConstructorDependencyTwo toString method";
    }
}
