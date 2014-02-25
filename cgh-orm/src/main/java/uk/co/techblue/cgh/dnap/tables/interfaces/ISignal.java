/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public interface ISignal extends java.io.Serializable {

	/**
	 * Setter for <code>cgh-processor.signal.SignalId</code>. 
	 */
	public void setSignalid(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.signal.SignalId</code>. 
	 */
	public java.lang.Long getSignalid();

	/**
	 * Setter for <code>cgh-processor.signal.ProbeName</code>. 
	 */
	public void setProbename(java.lang.String value);

	/**
	 * Getter for <code>cgh-processor.signal.ProbeName</code>. 
	 */
	public java.lang.String getProbename();

	/**
	 * Setter for <code>cgh-processor.signal.SystematicName</code>. 
	 */
	public void setSystematicname(java.lang.String value);

	/**
	 * Getter for <code>cgh-processor.signal.SystematicName</code>. 
	 */
	public java.lang.String getSystematicname();

	/**
	 * Setter for <code>cgh-processor.signal.LogRatio</code>. 
	 */
	public void setLogratio(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.signal.LogRatio</code>. 
	 */
	public java.lang.Double getLogratio();

	/**
	 * Setter for <code>cgh-processor.signal.gProcessedSignal</code>. 
	 */
	public void setGprocessedsignal(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.signal.gProcessedSignal</code>. 
	 */
	public java.lang.Double getGprocessedsignal();

	/**
	 * Setter for <code>cgh-processor.signal.rProcessedSignal</code>. 
	 */
	public void setRprocessedsignal(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.signal.rProcessedSignal</code>. 
	 */
	public java.lang.Double getRprocessedsignal();

	/**
	 * Setter for <code>cgh-processor.signal.gIsSaturated</code>. 
	 */
	public void setGissaturated(java.lang.Boolean value);

	/**
	 * Getter for <code>cgh-processor.signal.gIsSaturated</code>. 
	 */
	public java.lang.Boolean getGissaturated();

	/**
	 * Setter for <code>cgh-processor.signal.rIsSaturated</code>. 
	 */
	public void setRissaturated(java.lang.Boolean value);

	/**
	 * Getter for <code>cgh-processor.signal.rIsSaturated</code>. 
	 */
	public java.lang.Boolean getRissaturated();

	/**
	 * Setter for <code>cgh-processor.signal.gIsFeatNonUnifOL</code>. 
	 */
	public void setGisfeatnonunifol(java.lang.Boolean value);

	/**
	 * Getter for <code>cgh-processor.signal.gIsFeatNonUnifOL</code>. 
	 */
	public java.lang.Boolean getGisfeatnonunifol();

	/**
	 * Setter for <code>cgh-processor.signal.rIsFeatNonUnifOL</code>. 
	 */
	public void setRisfeatnonunifol(java.lang.Boolean value);

	/**
	 * Getter for <code>cgh-processor.signal.rIsFeatNonUnifOL</code>. 
	 */
	public java.lang.Boolean getRisfeatnonunifol();

	/**
	 * Setter for <code>cgh-processor.signal.gIsBGNonUnifOL</code>. 
	 */
	public void setGisbgnonunifol(java.lang.Boolean value);

	/**
	 * Getter for <code>cgh-processor.signal.gIsBGNonUnifOL</code>. 
	 */
	public java.lang.Boolean getGisbgnonunifol();

	/**
	 * Setter for <code>cgh-processor.signal.rIsBGNonUnifOL</code>. 
	 */
	public void setRisbgnonunifol(java.lang.Boolean value);

	/**
	 * Getter for <code>cgh-processor.signal.rIsBGNonUnifOL</code>. 
	 */
	public java.lang.Boolean getRisbgnonunifol();

	/**
	 * Setter for <code>cgh-processor.signal.Chromosome</code>. 
	 */
	public void setChromosome(java.lang.String value);

	/**
	 * Getter for <code>cgh-processor.signal.Chromosome</code>. 
	 */
	public java.lang.String getChromosome();

	/**
	 * Setter for <code>cgh-processor.signal.StartPosition</code>. 
	 */
	public void setStartposition(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.signal.StartPosition</code>. 
	 */
	public java.lang.Long getStartposition();

	/**
	 * Setter for <code>cgh-processor.signal.StopPosition</code>. 
	 */
	public void setStopposition(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.signal.StopPosition</code>. 
	 */
	public java.lang.Long getStopposition();

	/**
	 * Setter for <code>cgh-processor.signal.gIsWellAboveBG</code>. 
	 */
	public void setGiswellabovebg(java.lang.Byte value);

	/**
	 * Getter for <code>cgh-processor.signal.gIsWellAboveBG</code>. 
	 */
	public java.lang.Byte getGiswellabovebg();

	/**
	 * Setter for <code>cgh-processor.signal.rIsWellAboveBG</code>. 
	 */
	public void setRiswellabovebg(java.lang.Byte value);

	/**
	 * Getter for <code>cgh-processor.signal.rIsWellAboveBG</code>. 
	 */
	public java.lang.Byte getRiswellabovebg();

	/**
	 * Setter for <code>cgh-processor.signal.ArrayId</code>. 
	 */
	public void setArrayid(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.signal.ArrayId</code>. 
	 */
	public java.lang.Long getArrayid();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ISignal
	 */
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.ISignal from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ISignal
	 */
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.ISignal> E into(E into);
}
