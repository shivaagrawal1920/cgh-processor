/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class ZscoreRecord extends org.jooq.impl.UpdatableRecordImpl<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord> implements org.jooq.Record8<java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double>, uk.co.techblue.cgh.dnap.tables.interfaces.IZscore {

	private static final long serialVersionUID = -2048536301;

	/**
	 * Setter for <code>cgh-processor.zscore.ZScoreId</code>. 
	 */
	@Override
	public void setZscoreid(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZScoreId</code>. 
	 */
	@Override
	public java.lang.Long getZscoreid() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.RegionIntensityId</code>. 
	 */
	@Override
	public void setRegionintensityid(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.RegionIntensityId</code>. 
	 */
	@Override
	public java.lang.Long getRegionintensityid() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.ZMeanGreenSignal</code>. 
	 */
	@Override
	public void setZmeangreensignal(java.lang.Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZMeanGreenSignal</code>. 
	 */
	@Override
	public java.lang.Double getZmeangreensignal() {
		return (java.lang.Double) getValue(2);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.ZMedianGreenSignal</code>. 
	 */
	@Override
	public void setZmediangreensignal(java.lang.Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZMedianGreenSignal</code>. 
	 */
	@Override
	public java.lang.Double getZmediangreensignal() {
		return (java.lang.Double) getValue(3);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.ZMeanRedSignal</code>. 
	 */
	@Override
	public void setZmeanredsignal(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZMeanRedSignal</code>. 
	 */
	@Override
	public java.lang.Double getZmeanredsignal() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.ZMedianRedSignal</code>. 
	 */
	@Override
	public void setZmedianredsignal(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZMedianRedSignal</code>. 
	 */
	@Override
	public java.lang.Double getZmedianredsignal() {
		return (java.lang.Double) getValue(5);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.ZMeanLogRatio</code>. 
	 */
	@Override
	public void setZmeanlogratio(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZMeanLogRatio</code>. 
	 */
	@Override
	public java.lang.Double getZmeanlogratio() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>cgh-processor.zscore.ZMedianLogRatio</code>. 
	 */
	@Override
	public void setZmedianlogratio(java.lang.Double value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cgh-processor.zscore.ZMedianLogRatio</code>. 
	 */
	@Override
	public java.lang.Double getZmedianlogratio() {
		return (java.lang.Double) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZSCOREID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.REGIONINTENSITYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field3() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZMEANGREENSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field4() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZMEDIANGREENSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZMEANREDSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZMEDIANREDSIGNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZMEANLOGRATIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field8() {
		return uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE.ZMEDIANLOGRATIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getZscoreid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getRegionintensityid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value3() {
		return getZmeangreensignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value4() {
		return getZmediangreensignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getZmeanredsignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getZmedianredsignal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getZmeanlogratio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value8() {
		return getZmedianlogratio();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IZscore from) {
		setZscoreid(from.getZscoreid());
		setRegionintensityid(from.getRegionintensityid());
		setZmeangreensignal(from.getZmeangreensignal());
		setZmediangreensignal(from.getZmediangreensignal());
		setZmeanredsignal(from.getZmeanredsignal());
		setZmedianredsignal(from.getZmedianredsignal());
		setZmeanlogratio(from.getZmeanlogratio());
		setZmedianlogratio(from.getZmedianlogratio());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IZscore> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ZscoreRecord
	 */
	public ZscoreRecord() {
		super(uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE);
	}
}
