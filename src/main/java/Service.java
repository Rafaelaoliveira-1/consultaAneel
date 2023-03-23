import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Service {
    static String webService = "https://dadosabertos.aneel.gov.br/api/3/action/datastore_search";
    static int codigoSucesso = 200;

    public static dados buscaDados(String DatGeracaoConjuntoDados) throws Exception {
        String urlParaChamada = webService + DatGeracaoConjuntoDados + "/json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = util.converteJsonEmString(resposta);
        }
    }
}
