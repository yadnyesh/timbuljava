package io.adapterpattern;

import org.w3c.dom.Text;

public class CsvAdapterImpl implements TextFormattable {
	
	CsvFormattable csvFormattable;
	
	public CsvAdapterImpl(CsvFormattable csvFormattable) {
		this.csvFormattable = csvFormattable;
	}
	
	@Override
	public String formatText(String text) {
		String formattedText = csvFormattable.formatCsvText(text);
		return formattedText;
	}
}
