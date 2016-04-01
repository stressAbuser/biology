import java.util.Enumeration;

public class biology {
    public static void main(String[] args) {
        genome g = new genome();
        g.setDnaCodes();

        String DNA = "ATTACGATCTGCACAAGATCCT";
        char[] split = new char[DNA.length()];
        char[] result = new char[DNA.length()];

        split = g.dnaStringSplit(DNA);
        result = g.convertDNAtoRNA(split);
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]);

        }
        String rna = result.toString();
        int startPos = g.getStartingPosition(rna);
    }
}

class genome
{
    char[] dnaCodes = new char[5];


    public void setDnaCodes() {
        dnaCodes[0] = 'U';
        dnaCodes[1] = 'C';
        dnaCodes[2] = 'A';
        dnaCodes[3] = 'G';
        dnaCodes[4] = 'T';
    }

    public char getDnaCodes(int i) {
        return dnaCodes[i];
    }
    public char[] dnaStringSplit(String DNA){
        char[] dnaSplit = DNA.toCharArray();

        return dnaSplit;
    }

    public char[] convertDNAtoRNA(char[] dnaSplit){
        int contor = dnaSplit.length;
        char[] rnaSplit = new char[contor];

        for (int i = 0; i < contor; i++) {
                        {
                if (dnaSplit[i]=='A') rnaSplit[i]='U';
                    else
                if (dnaSplit[i]=='T') rnaSplit[i]='A';
                    else
                if (dnaSplit[i]=='C') rnaSplit[i]='G';
                    else
                if (dnaSplit[i]=='G') rnaSplit[i]='C';

            }



        }
        return rnaSplit;
    }

    public int getStartingPosition(String rna){
        return rna.indexOf("AUG");

    }

    public void translateRNA(String rna, int startpos){
        char[] rnaSplit = rna.toCharArray();
        int newContor = startpos;

    }
}
