package IOsystem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList02 {
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File file = new File(".");
        String[] list;
        if (args.length==0){
            list=file.list();
        }else{
            list=file.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
    }
}
