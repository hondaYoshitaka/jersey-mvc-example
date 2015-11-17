package example.server.dto;

import java.io.Serializable;
import java.util.List;
import jersey.repackaged.com.google.common.collect.Lists;

/**
 * メニュー画面用のビューDTO
 * -------------------------------------
 * @author honda
 */
public class IndexViewDto implements Serializable {
    
    private final List<AppAnchorLink> appLinks = Lists.newArrayList();

    public List<AppAnchorLink> getAppLinks() {
        return appLinks;
    }
    
    /**
     * 業務アプリのリンク情報を保持する内部クラス
     * ----------------------------------------
     * @author honda
     */
    public static class AppAnchorLink {
        
        private String label;
        
        private String appName;

        public String getLabel() {
            return label;
        }

        public String getAppName() {
            return appName;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

    }
}
