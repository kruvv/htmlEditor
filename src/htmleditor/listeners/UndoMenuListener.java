<<<<<<< HEAD
package htmleditor.listeners;



import htmleditor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

    /** Этот слушатель будет следить за меню, а если конкретнее,
     то за моментом, когда меню редактирования будет выбрано пользователем. В этот момент он
     будет запрашивать у представления можем ли мы сейчас отменить или вернуть какое-то
     действие, и в зависимости от этого делать доступными или не доступными пункты меню
     "Отменить" и "Вернуть".
     *
     */

public class UndoMenuListener implements MenuListener {
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    // Проверка доступности пунктов перед показом меню
    @Override
    public void menuSelected(MenuEvent menuEvent) {
        redoMenuItem.setEnabled(view.canRedo());
        undoMenuItem.setEnabled(view.canUndo());
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }



}
=======
package htmleditor.listeners;



import htmleditor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

    /** Этот слушатель будет следить за меню, а если конкретнее,
     то за моментом, когда меню редактирования будет выбрано пользователем. В этот момент он
     будет запрашивать у представления можем ли мы сейчас отменить или вернуть какое-то
     действие, и в зависимости от этого делать доступными или не доступными пункты меню
     "Отменить" и "Вернуть".
     *
     */

public class UndoMenuListener implements MenuListener {
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    // Проверка доступности пунктов перед показом меню
    @Override
    public void menuSelected(MenuEvent menuEvent) {
        redoMenuItem.setEnabled(view.canRedo());
        undoMenuItem.setEnabled(view.canUndo());
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }



}
>>>>>>> version 2.0
