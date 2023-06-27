package kwgh0st.springframework.app04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldDependencyInjection {
    @Autowired
    DependencyOne dependencyOne;
    @Autowired
    DependencyTwo dependencyTwo;

    @Override
    public String toString() {
        return "FieldDependencyInjection using: " + dependencyOne + " " + dependencyTwo;
    }
}
@Component
class DependencyOne {

    @Override
    public String toString() {
        return "Text from DependencyOne toString method";
    }
}
@Component
class DependencyTwo {
    @Override
    public String toString() {
        return "Text from DependencyTwo toString method";
    }
}
