/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Array extends org.jooq.impl.TableImpl<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord> {

	private static final long serialVersionUID = 38098933;

	/**
	 * The singleton instance of <code>cgh-processor.array</code>
	 */
	public static final uk.co.techblue.cgh.dnap.tables.Array ARRAY = new uk.co.techblue.cgh.dnap.tables.Array();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord> getRecordType() {
		return uk.co.techblue.cgh.dnap.tables.records.ArrayRecord.class;
	}

	/**
	 * The column <code>cgh-processor.array.ArrayID</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Long> ARRAYID = createField("ArrayID", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.array.FeatureExtractor_barcode</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.String> FEATUREEXTRACTOR_BARCODE = createField("FeatureExtractor_barcode", org.jooq.impl.SQLDataType.VARCHAR.length(22), this);

	/**
	 * The column <code>cgh-processor.array.AnyColorPrcntFeatNonUnifOL</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> ANYCOLORPRCNTFEATNONUNIFOL = createField("AnyColorPrcntFeatNonUnifOL", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.array.DerivativeLR_spread</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> DERIVATIVELR_SPREAD = createField("DerivativeLR_spread", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.array.g_Signal2Noise</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> G_SIGNAL2NOISE = createField("g_Signal2Noise", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.array.g_SignalIntensity</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> G_SIGNALINTENSITY = createField("g_SignalIntensity", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.array.r_Signal2Noise</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> R_SIGNAL2NOISE = createField("r_Signal2Noise", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.array.r_SignalIntensity</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> R_SIGNALINTENSITY = createField("r_SignalIntensity", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.array.Scan_Date</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.String> SCAN_DATE = createField("Scan_Date", org.jooq.impl.SQLDataType.VARCHAR.length(30), this);

	/**
	 * The column <code>cgh-processor.array.ShortArrayId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Double> SHORTARRAYID = createField("ShortArrayId", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>cgh-processor.array</code> table reference
	 */
	public Array() {
		super("array", uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR);
	}

	/**
	 * Create an aliased <code>cgh-processor.array</code> table reference
	 */
	public Array(java.lang.String alias) {
		super(alias, uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR, uk.co.techblue.cgh.dnap.tables.Array.ARRAY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord, java.lang.Long> getIdentity() {
		return uk.co.techblue.cgh.dnap.Keys.IDENTITY_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord> getPrimaryKey() {
		return uk.co.techblue.cgh.dnap.Keys.KEY_ARRAY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.ArrayRecord>>asList(uk.co.techblue.cgh.dnap.Keys.KEY_ARRAY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public uk.co.techblue.cgh.dnap.tables.Array as(java.lang.String alias) {
		return new uk.co.techblue.cgh.dnap.tables.Array(alias);
	}
}
