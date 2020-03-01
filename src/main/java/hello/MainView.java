package hello;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
@StyleSheet("frontend://styles.css")
public class MainView extends VerticalLayout {
  public MainView() {
       add(new Label("HELLO WOLRD"));
    }
}
