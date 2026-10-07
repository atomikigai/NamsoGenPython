package b1;

import android.content.Context;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean a(Context context, String str) {
        i.e(context, "context");
        i.e(str, "name");
        return context.deleteSharedPreferences(str);
    }
}
