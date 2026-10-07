package g1;

import android.text.Editable;
import androidx.emoji2.text.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4160a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f4161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f4162c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f4162c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
