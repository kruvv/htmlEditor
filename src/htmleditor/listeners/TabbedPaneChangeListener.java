<<<<<<< HEAD
package htmleditor.listeners;



import htmleditor.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

    /** Этот класс слушает и обрабатывает изменения состояния панели вкладок.
     *
     */

public class TabbedPaneChangeListener implements ChangeListener {

    private View view;

    /** Конструктор, принимающий представление в виде параметра и сохраняющий во
     внутреннее поле view класса.
     *
     */

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
=======
package htmleditor.listeners;



import htmleditor.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

    /** Этот класс слушает и обрабатывает изменения состояния панели вкладок.
     *
     */

public class TabbedPaneChangeListener implements ChangeListener {

    private View view;

    /** Конструктор, принимающий представление в виде параметра и сохраняющий во
     внутреннее поле view класса.
     *
     */

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
>>>>>>> version 2.0
