package h4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4933b;

    public /* synthetic */ b(Object obj, int i) {
        this.f4932a = i;
        this.f4933b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f4932a) {
            case 1:
                return ((Drawable.ConstantState) this.f4933b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f4932a) {
            case 0:
                return 0;
            case 1:
                return ((Drawable.ConstantState) this.f4933b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f4932a) {
            case 0:
                return new c(this);
            case 1:
                n2.e eVar = new n2.e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4933b).newDrawable();
                eVar.f7177a = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f7176f);
                return eVar;
            default:
                return (t8.a) this.f4933b;
        }
    }

    public b(t8.a aVar) {
        this.f4932a = 2;
        this.f4933b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f4932a) {
            case 0:
                return new c(this);
            case 1:
                n2.e eVar = new n2.e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4933b).newDrawable(resources);
                eVar.f7177a = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f7176f);
                return eVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f4932a) {
            case 1:
                n2.e eVar = new n2.e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4933b).newDrawable(resources, theme);
                eVar.f7177a = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f7176f);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
