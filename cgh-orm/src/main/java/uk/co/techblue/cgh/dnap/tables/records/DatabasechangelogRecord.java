/**
 * This class is generated by jOOQ
 */
package uk.co.techblue.cgh.dnap.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class DatabasechangelogRecord extends org.jooq.impl.UpdatableRecordImpl<uk.co.techblue.cgh.dnap.tables.records.DatabasechangelogRecord> implements org.jooq.Record11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, uk.co.techblue.cgh.dnap.tables.interfaces.IDatabasechangelog {

	private static final long serialVersionUID = 843704564;

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.ID</code>. 
	 */
	@Override
	public void setId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.ID</code>. 
	 */
	@Override
	public java.lang.String getId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.AUTHOR</code>. 
	 */
	@Override
	public void setAuthor(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.AUTHOR</code>. 
	 */
	@Override
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.FILENAME</code>. 
	 */
	@Override
	public void setFilename(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.FILENAME</code>. 
	 */
	@Override
	public java.lang.String getFilename() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.DATEEXECUTED</code>. 
	 */
	@Override
	public void setDateexecuted(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.DATEEXECUTED</code>. 
	 */
	@Override
	public java.sql.Timestamp getDateexecuted() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.ORDEREXECUTED</code>. 
	 */
	@Override
	public void setOrderexecuted(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.ORDEREXECUTED</code>. 
	 */
	@Override
	public java.lang.Integer getOrderexecuted() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.EXECTYPE</code>. 
	 */
	@Override
	public void setExectype(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.EXECTYPE</code>. 
	 */
	@Override
	public java.lang.String getExectype() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.MD5SUM</code>. 
	 */
	@Override
	public void setMd5sum(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.MD5SUM</code>. 
	 */
	@Override
	public java.lang.String getMd5sum() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.DESCRIPTION</code>. 
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.DESCRIPTION</code>. 
	 */
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.COMMENTS</code>. 
	 */
	@Override
	public void setComments(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.COMMENTS</code>. 
	 */
	@Override
	public java.lang.String getComments() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.TAG</code>. 
	 */
	@Override
	public void setTag(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.TAG</code>. 
	 */
	@Override
	public java.lang.String getTag() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>cgh-processor.DATABASECHANGELOG.LIQUIBASE</code>. 
	 */
	@Override
	public void setLiquibase(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cgh-processor.DATABASECHANGELOG.LIQUIBASE</code>. 
	 */
	@Override
	public java.lang.String getLiquibase() {
		return (java.lang.String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.FILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.DATEEXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.ORDEREXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.EXECTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.MD5SUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.COMMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG.LIQUIBASE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getDateexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getOrderexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExectype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getMd5sum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getComments();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getLiquibase();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(uk.co.techblue.cgh.dnap.tables.interfaces.IDatabasechangelog from) {
		setId(from.getId());
		setAuthor(from.getAuthor());
		setFilename(from.getFilename());
		setDateexecuted(from.getDateexecuted());
		setOrderexecuted(from.getOrderexecuted());
		setExectype(from.getExectype());
		setMd5sum(from.getMd5sum());
		setDescription(from.getDescription());
		setComments(from.getComments());
		setTag(from.getTag());
		setLiquibase(from.getLiquibase());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends uk.co.techblue.cgh.dnap.tables.interfaces.IDatabasechangelog> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DatabasechangelogRecord
	 */
	public DatabasechangelogRecord() {
		super(uk.co.techblue.cgh.dnap.tables.Databasechangelog.DATABASECHANGELOG);
	}
}
