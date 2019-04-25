package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import dao.DaoAluno;
import model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		List<Aluno> aluno = new ArrayList<>();
		DaoAluno da = new DaoAluno(aluno);
		Aluno a = new Aluno(1, "vanessa",new GregorianCalendar(1993, Calendar.SEPTEMBER, 3).getTime(), 1, "vanessa", "123");
		da.adicionaAluno(a);
		System.out.println(da.pesquisaAluno(0));
		
		
				
	}

}
