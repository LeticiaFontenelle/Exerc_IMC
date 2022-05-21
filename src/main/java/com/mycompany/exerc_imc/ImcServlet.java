
package com.mycompany.exerc_imc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Imc")
public class ImcServlet extends HttpServlet {

   
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
            PrintWriter out = resp.getWriter();
               
            
        //ENTRADAS
        double altura = Double.parseDouble(req.getParameter("altura"));
        double peso = Double.parseDouble(req.getParameter("peso"));
        
        //PROCESSAMENTO
        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.getImc();
        
        //SAÍDA
        out.println("IMC: " + imc);
        
      }
}