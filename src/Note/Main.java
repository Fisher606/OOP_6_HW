package Note;

import Note.controller.NoteController;
import Note.models.FileOperation;
import Note.models.FileOperationImpl;
import Note.models.NoteManager;
import Note.models.NoteManagerImpl;
import Note.veiws.NoteAdder;
import Note.veiws.ViewNote;

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