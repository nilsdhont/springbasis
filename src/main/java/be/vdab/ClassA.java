package be.vdab;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.Locale;

class ClassA implements InterfaceA {
	private String telefoonNrHelpDesk;
	private URL koersenURL;
	private Locale defaultTaalEnLand;
	private File importData;
	private BladRichtingInPrinter defaultBladRichting;
	private EMailAdres webMasterEMailAdres;
	private Date websiteGestart;
	
	public Date getWebsiteGestart() {
		return websiteGestart;
	}

	public void setWebsiteGestart(Date websiteGestart) {
		this.websiteGestart = websiteGestart;
	}

	public EMailAdres getWebMasterEMailAdres() {
		return webMasterEMailAdres;
	}

	public void setWebMasterEMailAdres(EMailAdres webMasterEMailAdres) {
		this.webMasterEMailAdres = webMasterEMailAdres;
	}

	public URL getKoersenURL() {
		return koersenURL;
	}

	public Locale getDefaultTaalEnLand() {
		return defaultTaalEnLand;
	}

	public File getImportData() {
		return importData;
	}

	public BladRichtingInPrinter getDefaultBladRichting() {
		return defaultBladRichting;
	}

	public void setKoersenURL(URL koersenURL) {
		this.koersenURL = koersenURL;
	}

	public void setDefaultTaalEnLand(Locale defaultTaalEnLand) {
		this.defaultTaalEnLand = defaultTaalEnLand;
	}

	public void setImportData(File importData) {
		this.importData = importData;
	}

	public void setDefaultBladRichting(BladRichtingInPrinter defaultBladRichting) {
		this.defaultBladRichting = defaultBladRichting;
	}

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public void setTelefoonNrHelpDesk(String telefoonNrHelpDesk) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
	}

	@Override
	public String getBoodschap() {
		return "ClassA object";
	}
}
