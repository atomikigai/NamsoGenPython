package x8;

import android.R;
import android.content.res.ColorStateList;
import com.bumptech.glide.c;
import l.a0;
import u0.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[][] f10307r = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10308f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iQ = c.q(this, app.namso_gen.spacehowen.R.attr.colorControlActivated);
            int iQ2 = c.q(this, app.namso_gen.spacehowen.R.attr.colorOnSurface);
            int iQ3 = c.q(this, app.namso_gen.spacehowen.R.attr.colorSurface);
            this.e = new ColorStateList(f10307r, new int[]{c.x(1.0f, iQ3, iQ), c.x(0.54f, iQ3, iQ2), c.x(0.38f, iQ3, iQ2), c.x(0.38f, iQ3, iQ2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10308f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f10308f = z4;
        if (z4) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
