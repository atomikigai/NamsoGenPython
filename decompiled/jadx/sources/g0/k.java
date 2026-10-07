package g0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f4144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f4145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4146c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f4144a = colorStateList;
        this.f4145b = configuration;
        this.f4146c = theme == null ? 0 : theme.hashCode();
    }
}
