package br.com.videoaulasneri.adelcio.cron;

import br.com.videoaulasneri.adelcio.nfefacil.NFefacil;
import br.com.videoaulasneri.adelcio.nfefacil.Processar_arq_xml_NFCe_cron;
import java.util.Date;
import javax.swing.JOptionPane;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobNFCe implements Job{ 
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
//            JOptionPane.showMessageDialog(null, "<html><h1 style='font-family: Calibri; font-size: 18pt; color: blue;'>Vai entrar em estado de espera de arquivo XML na pasta; \\nfe\\xml\\nfce para Gerar a NFCe(modelo 65) "
//                    + "<html><h1 style='font-family: Calibri; font-size: 18pt; color: blue;'>\nTime is " + new Date());
            Processar_arq_xml_NFCe_cron procNFCe_cron = new Processar_arq_xml_NFCe_cron();
            procNFCe_cron.executar(NFefacil.getInterval());
	} 
}