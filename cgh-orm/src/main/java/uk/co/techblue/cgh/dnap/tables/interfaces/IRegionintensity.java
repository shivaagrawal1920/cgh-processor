/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public interface IRegionintensity extends java.io.Serializable {

	/**
	 * Setter for <code>cgh-processor.regionintensity.RegionIntensityId</code>. 
	 */
	public void setRegionintensityid(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.RegionIntensityId</code>. 
	 */
	public java.lang.Long getRegionintensityid();

	/**
	 * Setter for <code>cgh-processor.regionintensity.RegionId</code>. 
	 */
	public void setRegionid(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.RegionId</code>. 
	 */
	public java.lang.Long getRegionid();

	/**
	 * Setter for <code>cgh-processor.regionintensity.Chromosome</code>. 
	 */
	public void setChromosome(java.lang.String value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.Chromosome</code>. 
	 */
	public java.lang.String getChromosome();

	/**
	 * Setter for <code>cgh-processor.regionintensity.StartPosition</code>. 
	 */
	public void setStartposition(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.StartPosition</code>. 
	 */
	public java.lang.Long getStartposition();

	/**
	 * Setter for <code>cgh-processor.regionintensity.StopPosition</code>. 
	 */
	public void setStopposition(java.lang.Long value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.StopPosition</code>. 
	 */
	public java.lang.Long getStopposition();

	/**
	 * Setter for <code>cgh-processor.regionintensity.FeatureExtractor_Barcode</code>. 
	 */
	public void setFeatureextractorBarcode(java.lang.String value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.FeatureExtractor_Barcode</code>. 
	 */
	public java.lang.String getFeatureextractorBarcode();

	/**
	 * Setter for <code>cgh-processor.regionintensity.MeanGreenSignal</code>. 
	 */
	public void setMeangreensignal(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.MeanGreenSignal</code>. 
	 */
	public java.lang.Double getMeangreensignal();

	/**
	 * Setter for <code>cgh-processor.regionintensity.MedianGreenSignal</code>. 
	 */
	public void setMediangreensignal(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.MedianGreenSignal</code>. 
	 */
	public java.lang.Double getMediangreensignal();

	/**
	 * Setter for <code>cgh-processor.regionintensity.MeanRedSignal</code>. 
	 */
	public void setMeanredsignal(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.MeanRedSignal</code>. 
	 */
	public java.lang.Double getMeanredsignal();

	/**
	 * Setter for <code>cgh-processor.regionintensity.MedianRedSignal</code>. 
	 */
	public void setMedianredsignal(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.MedianRedSignal</code>. 
	 */
	public java.lang.Double getMedianredsignal();

	/**
	 * Setter for <code>cgh-processor.regionintensity.MeanLogRatio</code>. 
	 */
	public void setMeanlogratio(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.MeanLogRatio</code>. 
	 */
	public java.lang.Double getMeanlogratio();

	/**
	 * Setter for <code>cgh-processor.regionintensity.MedianLogRatio</code>. 
	 */
	public void setMedianlogratio(java.lang.Double value);

	/**
	 * Getter for <code>cgh-processor.regionintensity.MedianLogRatio</code>. 
	 */
	public java.lang.Double getMedianlogratio();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IRegionintensity
	 */
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IRegionintensity from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IRegionintensity
	 */
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IRegionintensity> E into(E into);
}