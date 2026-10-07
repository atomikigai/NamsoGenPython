package ia;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f5246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f5247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f5248d;
    public final File e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f5249f;

    public b(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f5245a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f5246b = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f5247c = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f5248d = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.e = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f5249f = file5;
    }

    public static void a(File file) {
        if (file.exists() && d(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static synchronized void c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public final File b(String str, String str2) {
        File file = new File(this.f5247c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
