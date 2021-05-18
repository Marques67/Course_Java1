package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	
	Date data = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

	private Double saldo;
	private String extrato;
	private Double saque;
	private Double deposito;
	private Double transferencia;
	private Character visitaGerente;
	private Character trocaUsuario;
	
	public Account() {
	}
	
	public Account(Double saldo) {
		this.saldo = saldo;
	}

	public Account(String extrato) {
		this.extrato = extrato;
	}

	public Account(Double saldo, String extrato, Double saque, Double deposito, Double transferencia,
			Character visitaGerente, Character trocaUsuario) {
		this.saldo = saldo;
		this.extrato = extrato;
		this.saque = saque;
		this.deposito = deposito;
		this.transferencia = transferencia;
		this.visitaGerente = visitaGerente;
		this.trocaUsuario = trocaUsuario;
	}

	public Double getSaldo() {
		saldo = 100.00;
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getExtrato() {
		System.out.println("Saldo: "  + getSaldo());
		System.out.println("Transferências: " + getTransferencia());
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}

	public Double getSaque() {
		return getSaldo() - saque;
	}

	public void setSaque(Double saque) {
		this.saque = saque;
	}

	public Double getDeposito() {
		return deposito + getSaldo();
	}

	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}

	public Double getTransferencia() {
		return transferencia - getSaldo();
	}

	public void setTransferencia(Double transferencia) {
		this.transferencia = transferencia;
	}

	public Character getVisitaGerente() {
		return visitaGerente;
	}

	public void setVisitaGerente(Character visitaGerente) {
		this.visitaGerente = visitaGerente;
	}

	public Character getTrocaUsuario() {
		return trocaUsuario;
	}

	public void setTrocaUsuario(Character trocaUsuario) {
		this.trocaUsuario = trocaUsuario;
	}	
	
}
