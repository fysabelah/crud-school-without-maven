package main.br.escola.model.entities;

public class Curso {

    private Integer idCurso;

    private String nmCurso;

    public Curso() {

    }

    public Curso(Integer idCurso, String nmCurso) {
        this.idCurso = idCurso;
        this.nmCurso = nmCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNmCurso() {
        return nmCurso;
    }

    public void setNmCurso(String nmCurso) {
        this.nmCurso = nmCurso;
    }

    @Override
    public String toString() {
        return "Curso [idCurso=" + idCurso + ", nmCurso=" + nmCurso + "]";
    }

}
