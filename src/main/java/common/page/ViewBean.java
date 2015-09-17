package common.page;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ViewBean {

    public List<String> getStrings() {
        final ArrayList<String> Strings = new ArrayList<>();
        Strings.add("one");
        Strings.add("two");
        Strings.add("three");
        Strings.add("four");
        Strings.add("five");
        Strings.add("six");
        Strings.add("seven");
        Strings.add("eight");
        Strings.add("nine");
        Strings.add("ten");
        return Strings;
    }
}
