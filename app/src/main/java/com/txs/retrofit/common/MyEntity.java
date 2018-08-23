package com.txs.retrofit.common;

import java.util.List;

/**
 * <p>Author：edz<p>
 * <p>Date：2018/08/22<p>
 *
 * @Package:com.yr.example.common
 */
public class MyEntity  {



        /**
         * data : [{"priceUnit":"万元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180810135937?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"Homvee","buttType":1,"productId":null,"src":1,"old":false,"icon":[],"title":"Homvee测试","catgName":"医疗险","price":"100.06","name":"Homvee测试","id":"60","detail":null,"catgType":"LI","introduction":"may the force be with you"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180808145920?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180808001","buttType":1,"productId":null,"src":1,"old":false,"icon":[],"title":"test寿险产品","catgName":"寿险","price":"10.00","name":"test寿险产品","id":"57","detail":null,"catgType":"LI","introduction":"测试寿险产品"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720144905?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180748","buttType":2,"productId":null,"src":3,"old":false,"icon":[],"title":"百万身价两全保险B款","catgName":"重疾险","price":"22.00","name":"百万身价两全保险B款","id":"46","detail":"https://openapi.xiaozhibaoxian.com/APIH5/application/detail?applicationId=null&remark1=0","catgType":"LI","introduction":"为出行保驾，为意外护航。低额保费换来百万身价！\n投保年龄：18-60周岁\n保障期间：30年"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720144924?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180745","buttType":2,"productId":"9","src":3,"old":true,"icon":[],"title":"四季宝贝少儿重疾","catgName":"寿险","price":"6.00","name":"四季宝贝少儿重疾","id":"43","detail":"https://openapi.xiaozhibaoxian.com/APIH5/application/detail?applicationId=null&remark1=0","catgType":"LI","introduction":"30种重大疾病，少儿高发疾病门急诊（水痘、麻疹、秋季腹泻、手足口） 可保障！\n投保年龄：30天-17周岁\n保障期限：1年"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720145025?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180737","buttType":2,"productId":"n     ull","src":2,"old":false,"icon":[],"title":"男性百万恶性肿瘤险","catgName":"防癌险","price":"15.00","name":"男性百万恶性肿瘤险","id":"35","detail":"https://open-h5.datebaoxian.com/mobile/product/show/null?dcode=7JD96v&user_id=ddyunf0418&sign=b20d48fc2739645c934778b52f14fc13&t=1534902469&extend_field=0","catgType":"LI","introduction":"百万保额|宝贝专属|全年保障\n保额：升级款：男性恶性肿瘤   50万/100万\n          基础款：男性高发恶性肿瘤   50万/100万"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720145032?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180736","buttType":2,"productId":null,"src":2,"old":false,"icon":[],"title":"女性百万恶性肿瘤险","catgName":"防癌险","price":"3.00","name":"女性百万恶性肿瘤险","id":"34","detail":"https://open-h5.datebaoxian.com/mobile/product/show/null?dcode=7JD96v&user_id=ddyunf0418&sign=b20d48fc2739645c934778b52f14fc13&t=1534902469&extend_field=0","catgType":"LI","introduction":"百万保额|宝贝专属|全年保障\n保额：升级款：女性恶性肿瘤   50万/100万\n          基础款：女性高发恶性肿瘤   50万/100万"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720145039?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180735","buttType":2,"productId":"5","src":2,"old":true,"icon":[],"title":"少儿百万恶性肿瘤险","catgName":"防癌险","price":"3.50","name":"少儿百万恶性肿瘤险","id":"33","detail":"https://open-h5.datebaoxian.com/mobile/product/show/null?dcode=7JD96v&user_id=ddyunf0418&sign=b20d48fc2739645c934778b52f14fc13&t=1534902469&extend_field=0","catgType":"LI","introduction":"百万保额|宝贝专属|全年保障\n保额：未成年人恶性肿瘤   50万/100万\n          未成年人高发恶性肿瘤   50万/100万"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720145045?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180734","buttType":2,"productId":null,"src":2,"old":false,"icon":[],"title":"全家桶·百万医疗险-升级版","catgName":"医疗险","price":"15.50","name":"全家桶·百万医疗险-升级版","id":"32","detail":"https://open-h5.datebaoxian.com/mobile/product/show/null?dcode=7JD96v&user_id=ddyunf0418&sign=b20d48fc2     739645c934778b52f14fc13&t=1534902469&extend_field=0","catgType":"LI","introduction":"百万住院|家庭共享\n保额：住院医疗保障  300万/人\n          住院医疗共享保险金 400万"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720145105?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180732","buttType":2,"productId":null,"src":2,"old":false,"icon":[],"title":"个人全年意外险","catgName":"意外险","price":"3.00","name":"个人全年意外险","id":"30","detail":"https://open-h5.datebaoxian.com/mobile/product/show/null?dcode=7JD96v&user_id=ddyunf0418&sign=b20d48fc2739645c934778b52f14fc13&t=1534902469&extend_field=0","catgType":"LI","introduction":"只需30元起|高性价比|住院津贴\n保额：意外身故 10万/30万/50万\n          意外残疾 10万/ 30万/50万\n         意外医疗   1万/3万/5万\n"},{"priceUnit":"元","thumbnail":"http://test-ware-bucket.nos-eastchina1.126.net/ware/20180720145112?imageView&thumbnail=200x200&type=webp&r=1534902469777","code":"20180731","buttType":1,"productId":"12","src":1,"old":true,"icon":[],"title":"百万畅行两全保险","catgName":"意外险","price":"270.00","name":"百万畅行两全保险","id":"29","detail":null,"catgType":"LI","introduction":"各种意外伤害保险，保费低、保额高，全方位保障投保年龄范围广，18-50周岁都可投保，保障期限长，30年长期保障\n缴费方式灵活多样，可自由选择"}]
         * pageSize : 10
         * pageNum : 1
         * pages : 2
         * total : 11
         */

        private int pageSize;
        private int pageNum;
        private int pages;
        private int total;
        private List<DataBean> data;

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * priceUnit : 万元
             * thumbnail : http://test-ware-bucket.nos-eastchina1.126.net/ware/20180810135937?imageView&thumbnail=200x200&type=webp&r=1534902469777
             * code : Homvee
             * buttType : 1
             * productId : null
             * src : 1
             * old : false
             * icon : []
             * title : Homvee测试
             * catgName : 医疗险
             * price : 100.06
             * name : Homvee测试
             * id : 60
             * detail : null
             * catgType : LI
             * introduction : may the force be with you
             */

            private String priceUnit;
            private String thumbnail;
            private String code;
            private int buttType;
            private Object productId;
            private int src;
            private boolean old;
            private String title;
            private String catgName;
            private String price;
            private String name;
            private String id;
            private Object detail;
            private String catgType;
            private String introduction;
            private List<?> icon;

            public String getPriceUnit() {
                return priceUnit;
            }

            public void setPriceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public int getButtType() {
                return buttType;
            }

            public void setButtType(int buttType) {
                this.buttType = buttType;
            }

            public Object getProductId() {
                return productId;
            }

            public void setProductId(Object productId) {
                this.productId = productId;
            }

            public int getSrc() {
                return src;
            }

            public void setSrc(int src) {
                this.src = src;
            }

            public boolean isOld() {
                return old;
            }

            public void setOld(boolean old) {
                this.old = old;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCatgName() {
                return catgName;
            }

            public void setCatgName(String catgName) {
                this.catgName = catgName;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Object getDetail() {
                return detail;
            }

            public void setDetail(Object detail) {
                this.detail = detail;
            }

            public String getCatgType() {
                return catgType;
            }

            public void setCatgType(String catgType) {
                this.catgType = catgType;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public List<?> getIcon() {
                return icon;
            }

            public void setIcon(List<?> icon) {
                this.icon = icon;
            }
        }

}
