package Note;

import javax.swing.text.View;

import Note.controller.NoteController;
import Note.models.FileOperation;
import Note.models.FileOperationImpl;
import Note.models.NoteManager;
import Note.models.NoteManagerImpl;
import Note.views.NoteAdder;
import Note.views.ViewNote;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperationImpl("Homework//notes.txt");
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteController noteController = new NoteController(noteManagerImpl);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder );
        view.run();
    }
}