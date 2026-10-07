package sb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import androidx.lifecycle.j0;
import app.namso_gen.spacehowen.R;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f8466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f8467d = new i(a.f8463a);
    public final i e = new i(new j0(this, 6));

    public b(Context context) {
        this.f8464a = context;
    }

    public final GradientDrawable a() {
        return (GradientDrawable) this.f8467d.getValue();
    }

    public final void b(Rect rect) {
        int iRound;
        jc.i.e(rect, "parentBounds");
        this.f8466c = rect;
        int i = this.f8465b;
        Context context = this.f8464a;
        int dimensionPixelSize = i > 0 ? context.getResources().getDimensionPixelSize(R.dimen.cnb_badge_size) : context.getResources().getDimensionPixelSize(R.dimen.cnb_badge_size_numberless);
        double d10 = this.f8465b > 99 ? 1.5d : 1.0d;
        a().setCornerRadius(rect.height() * 0.5f);
        GradientDrawable gradientDrawableA = a();
        int i10 = rect.right;
        double d11 = ((double) dimensionPixelSize) * d10;
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d11 > 2.147483647E9d) {
            iRound = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        } else {
            iRound = d11 < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d11);
        }
        gradientDrawableA.setBounds(i10 - iRound, 0, rect.right, rect.top + dimensionPixelSize);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        jc.i.e(canvas, "canvas");
        if (a().getBounds().isEmpty()) {
            return;
        }
        a().draw(canvas);
        if (this.f8465b > 0) {
            Rect rect = new Rect();
            int i = this.f8465b;
            String strValueOf = i > 99 ? "99+" : String.valueOf(i);
            i iVar = this.e;
            ((TextPaint) iVar.getValue()).getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            canvas.drawText(strValueOf, a().getBounds().exactCenterX() - rect.exactCenterX(), a().getBounds().exactCenterY() + (rect.height() / 2), (TextPaint) iVar.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        a().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
