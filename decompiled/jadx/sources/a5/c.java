package a5;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f189b = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.firebase.ui.auth.data.client.email", "com.firebase.ui.auth.data.client.provider", "com.firebase.ui.auth.data.client.idpToken", "com.firebase.ui.auth.data.client.idpSecret")));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f190c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v9.d f191a;

    public static void a(Application application) {
        SharedPreferences.Editor editorEdit = application.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        Iterator it = f189b.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
