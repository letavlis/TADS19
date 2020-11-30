import java.util.Objects;
public class EscolheNum implements Comparable<EscolheNum>{

    private int numero;

    public EscolheNum(int numero){
        this.numero = numero;
    }
    public int getNum() {
        return numero;
    }

    public void setNum(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(EscolheNum o) {
        return this.numero - o.numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EscolheNum that = (EscolheNum) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "" + numero;
    }
}
