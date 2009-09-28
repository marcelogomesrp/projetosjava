package br.com.guaraba.wally.core.dominio.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 8514237812383539102L;
	@Id
	//@SequenceGenerator(name = "gera_fornecedor_id", sequenceName = "fornecedor_sequences", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gera_fornecedor_id")
    @GeneratedValue
    private Integer id;
    @Column(unique=true, length=14, nullable=false)
    private Long cnpj;
    @Column(length=100, nullable=false)
    private String nomeFantasia;
    @Column(length=100, nullable=false)
    private String razaoSocial;
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHoraCadastro;
    private Contato contato;
    private Endereco endereco;
    @OneToMany(mappedBy="fornecedor", fetch=FetchType.LAZY)
    private List<Produto> produtos;

    public Fornecedor() {

        this.contato = new Contato();
        this.endereco = new Endereco();
    }
    public Fornecedor(Long cnpj, String nomeFantasia, String razaoSocial, String nomeContato, String telefone, String email, String login, String senha, Date dataHoraCadastro, String logradouro, Integer numero, String complemento, String bairro, Integer cep, String cidade, String estado) {
        
    	this();
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.dataHoraCadastro = dataHoraCadastro;
        this.contato = new Contato(nomeContato, telefone, email, login, senha);
        this.endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
    }
    public Fornecedor(Integer id, Long cnpj, String nomeFantasia, String razaoSocial, String nomeContato, String telefone, String email, String login, String senha, Date dataHoraCadastro, String logradouro, Integer numero, String complemento, String bairro, Integer cep, String cidade, String estado) {
        
    	this(cnpj, nomeFantasia, razaoSocial, nomeContato, telefone, email, login, senha, dataHoraCadastro, logradouro, numero, complemento, bairro, cep, cidade, estado);
        this.id = id;
    }

    public Contato getContato() {
        return this.contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Integer getId() {
        return id;
    }

    public Long getCnpj() {
        return cnpj;
    }
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }
    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
	
	public Iterable<Produto> getProdutos() {

		return produtos;
	}

	public void adicionarProduto(Produto produto) {
		
		this.produtos.add(produto);
	}

	public void removerProduto(Produto produto) {
		
		this.produtos.remove(produto);
	}
    
    @Override
    public int hashCode() {
    	
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    	
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return "Fornecedor ID: ".concat(String.valueOf(this.getId()))
        .concat(", Nome Fantasia: ").concat(this.getNomeFantasia())
        .concat(", Razão Social: ").concat(this.getRazaoSocial())
        .concat(", CNPJ: ").concat(String.valueOf(this.getCnpj()));
    }
}