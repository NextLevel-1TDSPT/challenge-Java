package app;

import model.atendimento.Agendamento;
import model.atendimento.Avaliacao;
import model.atendimento.Procedimento;
import model.atendimento.Triagem;
import model.doacoes.Doacao;
import model.pessoas.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main (String[] args){


        System.out.println("--- ENDEREÇO ---");
        Endereco endereco1 = new Endereco("Meridiano", "249", "Itaquaquecetuba", "08592110");
        System.out.println(endereco1.obterEnderecoCompleto());

        //Pessoa p1 = new Pessoa(1, "Pessoa", "22211133322", endereco1);
        //Classe abstrata, não pode ser instanciada.

        System.out.println("----------------\n");
        System.out.println("--- DOADOR ---");
        Doador doador1 = new Doador(1, "Joao", "44455566671",endereco1,"joao@email.com","fisica");
        System.out.println(doador1.getNome());
        doador1.validarCadastro();

        System.out.println("----------------\n");
        System.out.println("--- CADASTRO INVÁLIDO ---");
        Doador doadorInvalido = new Doador(4, "Maria", "123", endereco1, "maria@email.com", "fisica");
        doadorInvalido.validarCadastro();

        System.out.println("----------------\n");
        System.out.println("--- JOVEM ---");
        Jovem jovem1 = new Jovem(2, "Lucas", "55544433322", endereco1, LocalDate.of(2010,3,25), "Concluida");
        System.out.println(jovem1.getNome());
        System.out.println("Idade " + jovem1.calcularIdade());
        jovem1.validarCadastro();

        System.out.println("----------------\n");
        System.out.println("--- DENTISTA ---");
        Dentista dentista1 = new Dentista(3, "Carlos", "22211133377", endereco1, "Sp 1234", "Indisponível");
        System.out.println(dentista1.getNome());
        dentista1.validarCadastro();
        System.out.println("Status:" + dentista1.getStatus());
        dentista1.registrarDisponibilidade("dia 18 as 8h");
        System.out.println("Status: " + dentista1.getStatus());

        System.out.println("----------------\n");
        System.out.println("--- DOAÇÃO ---");
        Doacao doacao1 = new Doacao(5, 50.25f, "pix", "Pendente");
        doacao1.processarPagamento();
        doacao1.emitirComprovante(doador1);

        System.out.println("----------------\n");
        System.out.println("--- TRIAGEM ---");
        Triagem triagem1 = new Triagem(7, LocalDate.of(2026, 9, 10), "Aprovado", "Sem observações");
        System.out.println(triagem1.getDataTriagem());
        System.out.println(triagem1.getResultado());
        System.out.println(triagem1.getObservacoes());

        System.out.println("----------------\n");
        System.out.println("--- AGENDAMENTO ---");
        Agendamento agendamento1 = new Agendamento(10, LocalDateTime.of(2026, 11, 20, 14, 30), "Agendado");
        System.out.println(agendamento1.getDataHora());
        System.out.println(agendamento1.getStatus());

        System.out.println("----------------\n");
        System.out.println("--- AVALIAÇÃO ---");
        Avaliacao avaliacao1 = new Avaliacao(3, LocalDate.of(2026, 11, 12), "Moderada");
        System.out.println(avaliacao1.getDataAvaliacao());
        System.out.println(avaliacao1.getGravidade());

        System.out.println("----------------\n");
        System.out.println("--- PROCEDIMENTO ---");
        Procedimento procedimento1 = new Procedimento(2, LocalDate.of(2026, 11, 20), "Limpeza", "Sem intercorrências");
        System.out.println(procedimento1.getDataProcedimento());
        System.out.println(procedimento1.getTipoProcedimento());
        System.out.println(procedimento1.getObservacoes());

        System.out.println("----------------\n");
        System.out.println("--- POLIMORFISMO ---");
        validar(doador1);
        validar(jovem1);
        validar(dentista1);

    }

    public static void validar(Pessoa p) {
        System.out.println(p.getNome());
        p.validarCadastro();
    }

}
