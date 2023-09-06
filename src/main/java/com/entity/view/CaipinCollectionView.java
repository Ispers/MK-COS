package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.CaipinCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 菜品收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("caipin_collection")
public class CaipinCollectionView extends CaipinCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String caipinCollectionValue;

	//级联表 菜品
		/**
		* 菜品名称
		*/

		@ColumnInfo(comment="菜品名称",type="varchar(200)")
		private String caipinName;
		/**
		* 菜品编号
		*/

		@ColumnInfo(comment="菜品编号",type="varchar(200)")
		private String caipinUuidNumber;
		/**
		* 菜品照片
		*/

		@ColumnInfo(comment="菜品照片",type="varchar(200)")
		private String caipinPhoto;
		/**
		* 菜品类型
		*/
		@ColumnInfo(comment="菜品类型",type="int(11)")
		private Integer caipinTypes;
			/**
			* 菜品类型的值
			*/
			@ColumnInfo(comment="菜品类型的字典表值",type="varchar(200)")
			private String caipinValue;
		/**
		* 菜品库存
		*/

		@ColumnInfo(comment="菜品库存",type="int(11)")
		private Integer caipinKucunNumber;
		/**
		* 金额
		*/
		@ColumnInfo(comment="金额",type="decimal(10,2)")
		private Double caipinNewMoney;
		/**
		* 菜品热度
		*/

		@ColumnInfo(comment="菜品热度",type="int(11)")
		private Integer caipinClicknum;
		/**
		* 菜品介绍
		*/

		@ColumnInfo(comment="菜品介绍",type="longtext")
		private String caipinContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer caipinDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public CaipinCollectionView() {

	}

	public CaipinCollectionView(CaipinCollectionEntity caipinCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, caipinCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getCaipinCollectionValue() {
		return caipinCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setCaipinCollectionValue(String caipinCollectionValue) {
		this.caipinCollectionValue = caipinCollectionValue;
	}


	//级联表的get和set 菜品

		/**
		* 获取： 菜品名称
		*/
		public String getCaipinName() {
			return caipinName;
		}
		/**
		* 设置： 菜品名称
		*/
		public void setCaipinName(String caipinName) {
			this.caipinName = caipinName;
		}

		/**
		* 获取： 菜品编号
		*/
		public String getCaipinUuidNumber() {
			return caipinUuidNumber;
		}
		/**
		* 设置： 菜品编号
		*/
		public void setCaipinUuidNumber(String caipinUuidNumber) {
			this.caipinUuidNumber = caipinUuidNumber;
		}

		/**
		* 获取： 菜品照片
		*/
		public String getCaipinPhoto() {
			return caipinPhoto;
		}
		/**
		* 设置： 菜品照片
		*/
		public void setCaipinPhoto(String caipinPhoto) {
			this.caipinPhoto = caipinPhoto;
		}
		/**
		* 获取： 菜品类型
		*/
		public Integer getCaipinTypes() {
			return caipinTypes;
		}
		/**
		* 设置： 菜品类型
		*/
		public void setCaipinTypes(Integer caipinTypes) {
			this.caipinTypes = caipinTypes;
		}


			/**
			* 获取： 菜品类型的值
			*/
			public String getCaipinValue() {
				return caipinValue;
			}
			/**
			* 设置： 菜品类型的值
			*/
			public void setCaipinValue(String caipinValue) {
				this.caipinValue = caipinValue;
			}

		/**
		* 获取： 菜品库存
		*/
		public Integer getCaipinKucunNumber() {
			return caipinKucunNumber;
		}
		/**
		* 设置： 菜品库存
		*/
		public void setCaipinKucunNumber(Integer caipinKucunNumber) {
			this.caipinKucunNumber = caipinKucunNumber;
		}

		/**
		* 获取： 金额
		*/
		public Double getCaipinNewMoney() {
			return caipinNewMoney;
		}
		/**
		* 设置： 金额
		*/
		public void setCaipinNewMoney(Double caipinNewMoney) {
			this.caipinNewMoney = caipinNewMoney;
		}

		/**
		* 获取： 菜品热度
		*/
		public Integer getCaipinClicknum() {
			return caipinClicknum;
		}
		/**
		* 设置： 菜品热度
		*/
		public void setCaipinClicknum(Integer caipinClicknum) {
			this.caipinClicknum = caipinClicknum;
		}

		/**
		* 获取： 菜品介绍
		*/
		public String getCaipinContent() {
			return caipinContent;
		}
		/**
		* 设置： 菜品介绍
		*/
		public void setCaipinContent(String caipinContent) {
			this.caipinContent = caipinContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getCaipinDelete() {
			return caipinDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setCaipinDelete(Integer caipinDelete) {
			this.caipinDelete = caipinDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "CaipinCollectionView{" +
			", caipinCollectionValue=" + caipinCollectionValue +
			", caipinName=" + caipinName +
			", caipinUuidNumber=" + caipinUuidNumber +
			", caipinPhoto=" + caipinPhoto +
			", caipinKucunNumber=" + caipinKucunNumber +
			", caipinNewMoney=" + caipinNewMoney +
			", caipinClicknum=" + caipinClicknum +
			", caipinContent=" + caipinContent +
			", caipinDelete=" + caipinDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", newMoney=" + newMoney +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
