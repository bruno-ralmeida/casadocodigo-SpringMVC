package br.com.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.dao.ProdutoDAO;
import br.com.casadocodigo.loja.model.Produto;

@Controller
public class ProdutosController {
	
	private ProdutoDAO dao;

	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String saveForm(Produto produto) {
		System.out.println(produto.toString());
		return "produtos/ok";
	}
}
