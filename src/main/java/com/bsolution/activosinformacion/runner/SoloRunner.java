package com.bsolution.activosinformacion.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bsolution.activosinformacion.entity.LeyFundamento;
import com.bsolution.activosinformacion.repository.LeyFundamentoRepository;

@Component
public class SoloRunner implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(SoloRunner.class);
	
	@Autowired
    private LeyFundamentoRepository leyfundamentorepository;

	@Override
    public void run(String... args) throws Exception {
    	try {
    		logger.info("Fundamentos encontrados: " + leyfundamentorepository.findAll().size());
    	}catch (Exception e) {
    		logger.error("Error al recuperar datos: "+ e.getStackTrace());
    	}
    	llenarDatos();
    }
	
	public void llenarDatos() {
    	//Crear Datos
		//leyfundamentorepository.deleteAll();
    	if (leyfundamentorepository.count()<=0) {
	    	try { 
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(1,"Información exceptuada por daño de derechos a personas naturales o jurídicas. Articulo 18 Ley 1712 de 2014","El derecho de toda persona a la intimidad, bajo las limitaciones propias que impone la condición de servidor publico, en concordancia con lo estipulado","Publica Clasificada","Ilimitada"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(2,"Información exceptuada por daño de derechos a personas naturales o jurídicas. Articulo 18 Ley 1712 de 2014","El derecho de toda persona a la vida, la salud o la seguridad","Publica Clasificada","Ilimitada"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(3,"Información exceptuada por daño de derechos a personas naturales o jurídicas. Articulo 18 Ley 1712 de 2014","Los secretos comerciales, industriales y profesionales, así como los estipulados en el parágrafo del articulo 77 de la Ley 1474 de 2011","Publica Clasificada","Ilimitada"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(4,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","Defensa y seguridad nacional","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(5,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","La seguridad publica","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(6,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","Las relaciones internacionales","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(7,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","La prevención, investigación y persecución de delitos y las faltas disciplinarias, mientras que no se haga efectiva la medida de aseguramiento o se formule pliego de cargos, según el caso.","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(8,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","El debido proceso y la igualdad de las partes de los procesos judiciales","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(9,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","La administración efectiva de la justicia","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(10,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","Los derechos de la infancia y la adolescencia","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(11,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","La estabilidad macroeconómica y financiera del país","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(12,"Información exceptuada por daño a los intereses públicos. Articulo 19 Ley 1712 de 2014","La salud publica","Publica Reservada","No Mayor a 15 años"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(13,"El contenido público puede ser conocido y se limitará el acceso a solicitud a contenido reservado o clasificado","Información publica con restricción de acceso a la totalidad del contenido","Pública Reservada / Clasificada","No Mayor a 15 años (Reservada) / Ilimitada Clasificada"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(14,"Información publica y de conocimiento general","Información publica y de conocimiento general","Publica","No Aplica"));
	    		leyfundamentorepository.saveAndFlush(new LeyFundamento(15,"El contenido público podrá ser conocido y se limitará el acceso a solicitud a contenido reservado o clasificado","Información publica con restricción de acceso a la totalidad del contenido","Publica Clasificada","Ilimitada"));
	    	}catch (Exception e) {
	    		logger.error("Error al llenar datos: "+ e.getMessage());
	    	}
    	}
	}
}
