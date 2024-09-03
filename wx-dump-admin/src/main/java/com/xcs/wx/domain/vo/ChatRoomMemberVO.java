package com.xcs.wx.domain.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * ChatRoomMemberVO
 *
 * @author xcs
 * @date 2024年01月08日 16时10分
 **/
@Data
public class ChatRoomMemberVO {

    /**
     * wxId
     */
    @ColumnWidth(25)
    @ExcelProperty("微信Id")
    private String wxId;

    /**
     * 别名
     */
    @ColumnWidth(25)
    @ExcelProperty("微信号")
    private String alias;

    /**
     * 用户昵称
     */
    @ColumnWidth(30)
    @ExcelProperty("用户昵称")
    private String nickName;

    /**
     * 好友备注
     */
    @ColumnWidth(25)
    @ExcelProperty("好友备注")
    private String userRemark;


    /**
     * 群备注
     */
    @ColumnWidth(25)
    @ExcelProperty("群备注")
    private String remark;

    /**
     * 备注
     */
    @ColumnWidth(25)
    @ExcelProperty("状态")
    private Integer state;

    /**
     * 头像
     */
    @ColumnWidth(25)
    @ExcelProperty("用户头像")
    private String headImgUrl;
}
