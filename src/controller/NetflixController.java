package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import br.edu.fateczl.filaobj.Fila;
import model.Serie;

public class NetflixController implements INextflixController {
	
	public NetflixController() {

	}
	 String path = "c:\\Temp";
	 String filme = "netflix_originals_series_2";
	public void readFile (String path, String arquivo) throws IOException {
		File arq = new File (path, arquivo);
		//Fila f = new Fila ();
		int cont =0;
		String aux = null;
			if (arq.exists() && arq.isFile()) {
				FileInputStream abreFluxoArq = new FileInputStream (arq);
				InputStreamReader leitorFluxo = new InputStreamReader (abreFluxoArq);
				BufferedReader buffer = new BufferedReader (leitorFluxo);
				String linha = buffer.readLine();
				while (linha != null) {
				String [] vt = linha.split (",");
					Serie s = new Serie ();
						if (cont==0) {
							aux = vt[0];
							s.setmajor(vt[0]);
					}else if(aux == vt[0]) {
						s.settitle(vt[1]);
						s.setsubgenere(vt [2]);
						s.setstatus(vt [6]);
						s.setimdb(Integer.parseInt(vt [11]));
					}
				}
			}
				}
						/*if(String  )) {
							s.setepisodio(vt [5]);
						}
				cont++;
					} else {
						cont =0;
					}
				f.insert();
				}
	    }
	    }*/

		@Override
	 public String filamajor_genre() {
	 // TODO Auto-generated method stub
	 return null;
			 }

	
	@Override
	public int listapremiere() {
	 // TODO Auto-generated method stub
	return 0;
			}

	 @Override	
	public void tabelaimdb() {
			 // TODO Auto-generated method stub

	}

		@Override
		public void buscaespalhamento() {
	}
	}
