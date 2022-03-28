package com.company;

import java.util.List;

public class Classroom {
    private int id;
    private String destination; // pentru ce e utilizata clasa respectiva: curs, activitati extra, sala de mese, sala de joaca etc
    private float capacity; // cati elevi pot desfasura activitati in ea

    private List<Student> students; // fiecare clasa are alocata o lista de elevi care isi desfasoara activitatile in ea
    private Schedule schedule; // intr-un anumit interval de timp
                                // adica de la ora la ora, in fiecare sala se pot schimba elevii prezenti


}
