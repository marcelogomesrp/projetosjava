/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import org.richfaces.model.Ordering;

/**
 *
 * @author marcelo
 */
public class Facet {
	private String header;
	private String footer;

	/**
	 * TODO Description goes here.
	 * @param header
	 * @param footer
	 */
	public Facet(String header, String footer) {
	    super();
	    this.header = header;
	    this.footer = footer;
	}
	/**
	 * @return the header
	 */
	public String getHeader() {
	    return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
	    this.header = header;
	}
	/**
	 * @return the footer
	 */
	public String getFooter() {
	    return footer;
	}
	/**
	 * @param footer the footer to set
	 */
	public void setFooter(String footer) {
	    this.footer = footer;
	}

	private Ordering sortOrder;

	public Ordering getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Ordering sortOrder) {
		this.sortOrder = sortOrder;
	}
}
