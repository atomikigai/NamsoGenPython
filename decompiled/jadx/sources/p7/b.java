package p7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7823a;

    public b(Context context) {
        this.f7823a = context;
    }

    public synchronized void a() {
        try {
            long j4 = ((SharedPreferences) this.f7823a).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f7823a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f7823a).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.f7823a).edit().putStringSet(key, hashSet).putLong("fire-count", j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f7823a).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f7823a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strE = e(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strE)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strE);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f7823a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(e(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new wa.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.f7823a).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public ApplicationInfo d(int i, String str) {
        return ((Context) this.f7823a).getPackageManager().getApplicationInfo(str, i);
    }

    public synchronized String e(long j4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j4)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j4));
    }

    public PackageInfo f(int i, String str) {
        return ((Context) this.f7823a).getPackageManager().getPackageInfo(str, i);
    }

    public synchronized String g(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f7823a).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public boolean h() {
        String nameForUid;
        Context context = (Context) this.f7823a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.b(context);
        }
        if (!n7.c.h() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public synchronized void i(String str) {
        try {
            String strG = g(str);
            if (strG == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f7823a).getStringSet(strG, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f7823a).edit().remove(strG).commit();
            } else {
                ((SharedPreferences) this.f7823a).edit().putStringSet(strG, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean j(long j4) {
        if (!((SharedPreferences) this.f7823a).contains("fire-global")) {
            ((SharedPreferences) this.f7823a).edit().putLong("fire-global", j4).commit();
            return true;
        }
        long j10 = ((SharedPreferences) this.f7823a).getLong("fire-global", -1L);
        synchronized (this) {
            if (e(j10).equals(e(j4))) {
                return false;
            }
            ((SharedPreferences) this.f7823a).edit().putLong("fire-global", j4).commit();
            return true;
        }
    }

    public synchronized void k(String str, long j4) {
        String strE = e(j4);
        if (((SharedPreferences) this.f7823a).getString("last-used-date", "").equals(strE)) {
            String strG = g(strE);
            if (strG == null) {
                return;
            }
            if (strG.equals(str)) {
                return;
            }
            l(str, strE);
            return;
        }
        long j10 = ((SharedPreferences) this.f7823a).getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = ((SharedPreferences) this.f7823a).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f7823a).getStringSet(str, new HashSet()));
        hashSet.add(strE);
        ((SharedPreferences) this.f7823a).edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", strE).commit();
    }

    public synchronized void l(String str, String str2) {
        i(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f7823a).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f7823a).edit().putStringSet(str, hashSet).commit();
    }

    public b(Context context, String str) {
        this.f7823a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
