package br.com.ws.loja;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * Created by felipe.tavares on 19/01/16.
 */
public class ClienteTest {

    @Test
    public void testaConexaoComServidor(){

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://www.mocky.io");
        String conteudo = webTarget.path("v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
        Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));

    }

}
