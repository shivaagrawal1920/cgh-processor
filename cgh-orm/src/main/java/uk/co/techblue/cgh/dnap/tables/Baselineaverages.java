/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Baselineaverages extends org.jooq.impl.TableImpl<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord> {

	private static final long serialVersionUID = 188683367;

	/**
	 * The singleton instance of <code>cgh-processor.baselineaverages</code>
	 */
	public static final uk.co.techblue.cgh.dnap.tables.Baselineaverages BASELINEAVERAGES = new uk.co.techblue.cgh.dnap.tables.Baselineaverages();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord> getRecordType() {
		return uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord.class;
	}

	/**
	 * The column <code>cgh-processor.baselineaverages.BaselineAveragesId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> BASELINEAVERAGESID = createField("BaselineAveragesId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.RegionId</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> REGIONID = createField("RegionId", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANGREENSIGNAL = createField("BMeanGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanGreenSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANGREENSIGNALSD = createField("BMeanGreenSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianGreenSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANGREENSIGNAL = createField("BMedianGreenSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianGreenSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANGREENSIGNALSD = createField("BMedianGreenSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANREDSIGNAL = createField("BMeanRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanRedSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANREDSIGNALSD = createField("BMeanRedSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianRedSignal</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANREDSIGNAL = createField("BMedianRedSignal", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianRedSignalSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANREDSIGNALSD = createField("BMedianRedSignalSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANLOGRATIO = createField("BMeanLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanLogRatioSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANLOGRATIOSD = createField("BMeanLogRatioSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianLogRatio</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANLOGRATIO = createField("BMedianLogRatio", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianLogRatioSD</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANLOGRATIOSD = createField("BMedianLogRatioSD", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanGreenSignal_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANGREENSIGNAL_M = createField("BMeanGreenSignal_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanGreenSignalSD_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANGREENSIGNALSD_M = createField("BMeanGreenSignalSD_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianGreenSignal_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANGREENSIGNAL_M = createField("BMedianGreenSignal_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianGreenSignalSD_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANGREENSIGNALSD_M = createField("BMedianGreenSignalSD_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanRedSignal_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANREDSIGNAL_M = createField("BMeanRedSignal_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanRedSignalSD_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANREDSIGNALSD_M = createField("BMeanRedSignalSD_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianRedSignal_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANREDSIGNAL_M = createField("BMedianRedSignal_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianRedSignalSD_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANREDSIGNALSD_M = createField("BMedianRedSignalSD_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanLogRatio_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANLOGRATIO_M = createField("BMeanLogRatio_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMeanLogRatioSD_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEANLOGRATIOSD_M = createField("BMeanLogRatioSD_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianLogRatio_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANLOGRATIO_M = createField("BMedianLogRatio_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>cgh-processor.baselineaverages.BMedianLogRatioSD_M</code>. 
	 */
	public final org.jooq.TableField<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Double> BMEDIANLOGRATIOSD_M = createField("BMedianLogRatioSD_M", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>cgh-processor.baselineaverages</code> table reference
	 */
	public Baselineaverages() {
		super("baselineaverages", uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR);
	}

	/**
	 * Create an aliased <code>cgh-processor.baselineaverages</code> table reference
	 */
	public Baselineaverages(java.lang.String alias) {
		super(alias, uk.co.techblue.cgh.dnap.CghProcessor.CGH_PROCESSOR, uk.co.techblue.cgh.dnap.tables.Baselineaverages.BASELINEAVERAGES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord, java.lang.Long> getIdentity() {
		return uk.co.techblue.cgh.dnap.Keys.IDENTITY_BASELINEAVERAGES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord> getPrimaryKey() {
		return uk.co.techblue.cgh.dnap.Keys.KEY_BASELINEAVERAGES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<uk.co.techblue.cgh.dnap.tables.records.BaselineaveragesRecord>>asList(uk.co.techblue.cgh.dnap.Keys.KEY_BASELINEAVERAGES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public uk.co.techblue.cgh.dnap.tables.Baselineaverages as(java.lang.String alias) {
		return new uk.co.techblue.cgh.dnap.tables.Baselineaverages(alias);
	}
}
