/*
 * File: MyForm.js
 * Date: Sat Sep 25 2010 20:33:45 GMT-0500 (Central Daylight Time)
 * 
 * This file was generated by Ext Designer version xds-1.0.2.14.
 * http://www.extjs.com/products/designer/
 *
 * This file will be generated the first time you export.
 *
 * You should implement event handling and custom methods in this
 * class.
 */

MyForm = Ext.extend(MyFormUi, {
    initComponent: function() {
        MyForm.superclass.initComponent.call(this);
        this.submit.on('click', this.submit_form, this);
    },
	submit_form : function() {
		this.getForm().submit();
	}
});
