package kwgh0st.springframework.app04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterDependencyInjection {
    SetterDependencyOne setterDependencyOne;
    SetterDependencyTwo setterDependencyTwo;

    @Autowired
    public void setSetterDependencyOne(SetterDependencyOne setterDependencyOne) {
        this.setterDependencyOne = setterDependencyOne;
    }

    @Autowired
    public void setSetterDependencyTwo(SetterDependencyTwo setterDependencyTwo) {
        this.setterDependencyTwo = setterDependencyTwo;
    }

    @Override
    public String toString() {
        return "SetterDependencyInjection using: " + setterDependencyOne + " " + setterDependencyTwo;
    }
}

@Component
class SetterDependencyOne {
    @Override
    public String toString() {
        return "Text from SetterDependencyOne toString method";
    }

}

@Component
class SetterDependencyTwo {
    @Override
    public String toString() {
        return "Text from SetterDependencyTwo toString method";
    }
}
