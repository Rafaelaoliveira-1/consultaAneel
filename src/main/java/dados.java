public class dados {

    String DatGeracaoConjuntoDados;
    String DscClasseConsumo;
    String MdaPotenciaInstaladaKW;
    String SigUF;

    @Override
    public String toString() {
        return "Data{" + "ClasseConsumo=" + DscClasseConsumo + ", Instalação KM=" + MdaPotenciaInstaladaKW + ", UF=" + SigUF + '}';
    }

    public String getDatGeracaoConjuntoDados() {
        return DatGeracaoConjuntoDados;
    }

    public void setDatGeracaoConjuntoDados(String datGeracaoConjuntoDados) {
        DatGeracaoConjuntoDados = datGeracaoConjuntoDados;
    }

    public String getDscClasseConsumo() {
        return DscClasseConsumo;
    }

    public void setDscClasseConsumo(String dscClasseConsumo) {
        DscClasseConsumo = dscClasseConsumo;
    }

    public String getMdaPotenciaInstaladaKW() {
        return MdaPotenciaInstaladaKW;
    }

    public void setMdaPotenciaInstaladaKW(String mdaPotenciaInstaladaKW) {
        MdaPotenciaInstaladaKW = mdaPotenciaInstaladaKW;
    }

    public String getSigUF() {
        return SigUF;
    }

    public void setSigUF(String sigUF) {
        SigUF = sigUF;
    }
}
