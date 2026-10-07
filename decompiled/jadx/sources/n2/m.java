package n2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f7211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f7212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f7213d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f7214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7215g;
    public PorterDuff.Mode h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f7218l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7210a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
