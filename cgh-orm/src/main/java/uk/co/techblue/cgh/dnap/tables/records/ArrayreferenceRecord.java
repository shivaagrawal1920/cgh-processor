/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class ArrayreferenceRecord extends org.jooq.impl.UpdatableRecordImpl<uk.co.techblue.cgh.dnap.tables.records.ArrayreferenceRecord> implements org.jooq.Record15<java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, uk.co.techblue.cgh.dnap.tables.interfaces.IArrayreference {

	private static final long serialVersionUID = 1988192017;

	/**
	 * Setter for <code>cgh-processor.arrayreference.ArrayID</code>. 
	 */
	@Override
	public void setArrayid(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.ArrayID</code>. 
	 */
	@Override
	public java.lang.Long getArrayid() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.FeatureExtractor_barcode</code>. 
	 */
	@Override
	public void setFeatureextractorBarcode(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.FeatureExtractor_barcode</code>. 
	 */
	@Override
	public java.lang.String getFeatureextractorBarcode() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.AnyColorPrcntFeatNonUnifOL</code>. 
	 */
	@Override
	public void setAnycolorprcntfeatnonunifol(java.lang.Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.AnyColorPrcntFeatNonUnifOL</code>. 
	 */
	@Override
	public java.lang.Double getAnycolorprcntfeatnonunifol() {
		return (java.lang.Double) getValue(2);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.DerivativeLR_spread</code>. 
	 */
	@Override
	public void setDerivativelrSpread(java.lang.Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.DerivativeLR_spread</code>. 
	 */
	@Override
	public java.lang.Double getDerivativelrSpread() {
		return (java.lang.Double) getValue(3);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.g_Signal2Noise</code>. 
	 */
	@Override
	public void setGSignal2noise(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.g_Signal2Noise</code>. 
	 */
	@Override
	public java.lang.Double getGSignal2noise() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.g_SignalIntensity</code>. 
	 */
	@Override
	public void setGSignalintensity(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.g_SignalIntensity</code>. 
	 */
	@Override
	public java.lang.Double getGSignalintensity() {
		return (java.lang.Double) getValue(5);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.r_Signal2Noise</code>. 
	 */
	@Override
	public void setRSignal2noise(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.r_Signal2Noise</code>. 
	 */
	@Override
	public java.lang.Double getRSignal2noise() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.r_SignalIntensity</code>. 
	 */
	@Override
	public void setRSignalintensity(java.lang.Double value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.r_SignalIntensity</code>. 
	 */
	@Override
	public java.lang.Double getRSignalintensity() {
		return (java.lang.Double) getValue(7);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.Scan_Date</code>. 
	 */
	@Override
	public void setScanDate(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.Scan_Date</code>. 
	 */
	@Override
	public java.lang.String getScanDate() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.ShortArrayId</code>. 
	 */
	@Override
	public void setShortarrayid(java.lang.Double value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.ShortArrayId</code>. 
	 */
	@Override
	public java.lang.Double getShortarrayid() {
		return (java.lang.Double) getValue(9);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.Protocol_Name</code>. 
	 */
	@Override
	public void setProtocolName(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.Protocol_Name</code>. 
	 */
	@Override
	public java.lang.String getProtocolName() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.Grid_GenomicBuild</code>. 
	 */
	@Override
	public void setGridGenomicbuild(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.Grid_GenomicBuild</code>. 
	 */
	@Override
	public java.lang.String getGridGenomicbuild() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.FeatureExtractor_ScanFileName</code>. 
	 */
	@Override
	public void setFeatureextractorScanfilename(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.FeatureExtractor_ScanFileName</code>. 
	 */
	@Override
	public java.lang.String getFeatureextractorScanfilename() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.FeatureExtractor_DesignFileName</code>. 
	 */
	@Override
	public void setFeatureextractorDesignfilename(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.FeatureExtractor_DesignFileName</code>. 
	 */
	@Override
	public java.lang.String getFeatureextractorDesignfilename() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>cgh-processor.arrayreference.Sex</code>. 
	 */
	@Override
	public void setSex(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cgh-processor.arrayreference.Sex</code>. 
	 */
	@Override
	public java.lang.String getSex() {
		return (java.lang.String) getValue(14);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.Long, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.ARRAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.FEATUREEXTRACTOR_BARCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field3() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.ANYCOLORPRCNTFEATNONUNIFOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field4() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.DERIVATIVELR_SPREAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.G_SIGNAL2NOISE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.G_SIGNALINTENSITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.R_SIGNAL2NOISE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field8() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.R_SIGNALINTENSITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.SCAN_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field10() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.SHORTARRAYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.PROTOCOL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.GRID_GENOMICBUILD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.FEATUREEXTRACTOR_SCANFILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.FEATUREEXTRACTOR_DESIGNFILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE.SEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getArrayid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFeatureextractorBarcode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value3() {
		return getAnycolorprcntfeatnonunifol();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value4() {
		return getDerivativelrSpread();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getGSignal2noise();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getGSignalintensity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getRSignal2noise();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value8() {
		return getRSignalintensity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getScanDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value10() {
		return getShortarrayid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getProtocolName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getGridGenomicbuild();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getFeatureextractorScanfilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getFeatureextractorDesignfilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getSex();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IArrayreference from) {
		setArrayid(from.getArrayid());
		setFeatureextractorBarcode(from.getFeatureextractorBarcode());
		setAnycolorprcntfeatnonunifol(from.getAnycolorprcntfeatnonunifol());
		setDerivativelrSpread(from.getDerivativelrSpread());
		setGSignal2noise(from.getGSignal2noise());
		setGSignalintensity(from.getGSignalintensity());
		setRSignal2noise(from.getRSignal2noise());
		setRSignalintensity(from.getRSignalintensity());
		setScanDate(from.getScanDate());
		setShortarrayid(from.getShortarrayid());
		setProtocolName(from.getProtocolName());
		setGridGenomicbuild(from.getGridGenomicbuild());
		setFeatureextractorScanfilename(from.getFeatureextractorScanfilename());
		setFeatureextractorDesignfilename(from.getFeatureextractorDesignfilename());
		setSex(from.getSex());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IArrayreference> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ArrayreferenceRecord
	 */
	public ArrayreferenceRecord() {
		super(uk.co.techblue.cgh.dnap.tables.Arrayreference.ARRAYREFERENCE);
	}
}
