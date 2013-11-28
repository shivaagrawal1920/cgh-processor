/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Zscore extends org.jooq.impl.TableImpl<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord> {

	private static final long serialVersionUID = -309914703;

	/**
	 * The singleton instance of <code>cgh-processor.zscore</code>
	 */
	public static final uk.co.techblue.cgh.dnap.tables.Zscore ZSCORE = new uk.co.techblue.cgh.dnap.tables.Zscore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord> getRecordType() {
		return uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord.class;
	}

	/**
	 * The column <code>cgh-processor.zscore.ZScoreId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Long> ZSCOREID = createField("ZScoreId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.zscore.RegionIntensityId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Long> REGIONINTENSITYID = createField("RegionIntensityId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.zscore.ZMeanGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Double> ZMEANGREENSIGNAL = createField("ZMeanGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.zscore.ZMedianGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Double> ZMEDIANGREENSIGNAL = createField("ZMedianGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.zscore.ZMeanRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Double> ZMEANREDSIGNAL = createField("ZMeanRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.zscore.ZMedianRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Double> ZMEDIANREDSIGNAL = createField("ZMedianRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.zscore.ZMeanLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Double> ZMEANLOGRATIO = createField("ZMeanLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.zscore.ZMedianLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Double> ZMEDIANLOGRATIO = createField("ZMedianLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>cgh-processor.zscore</code> table reference
	 */
	public Zscore() {
		super("zscore", uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR);
	}

	/**
	 * Create an aliased <code>cgh-processor.zscore</code> table reference
	 */
	public Zscore(java.lang.String alias) {
		super(alias, uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR, uk.co.techblue.cgh.dnap.tables.Zscore.ZSCORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord, java.lang.Long> getIdentity() {
		return uk.co.techblue.cgh.dnap.Keys.IDENTITY_ZSCORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord> getPrimaryKey() {
		return uk.co.techblue.cgh.dnap.Keys.KEY_ZSCORE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.ZscoreRecord>>asList(uk.co.techblue.cgh.dnap.Keys.KEY_ZSCORE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public uk.co.techblue.cgh.dnap.tables.Zscore as(java.lang.String alias) {
		return new uk.co.techblue.cgh.dnap.tables.Zscore(alias);
	}
}