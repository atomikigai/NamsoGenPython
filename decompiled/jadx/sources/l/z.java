package l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6496d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6497a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f6498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6499c;

    public /* synthetic */ z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((aa.c) ((a4.b) this.f6499c).f113b).getClass();
        if (keyListener instanceof g1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f6497a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f6498b;
                a2.l lVarG = a2.l.G(absSeekBar.getContext(), attributeSet, f6496d, i);
                Drawable drawableV = lVarG.v(0);
                if (drawableV != null) {
                    if (drawableV instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableV;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i10), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableV = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableV);
                }
                Drawable drawableV2 = lVarG.v(1);
                if (drawableV2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableV2, false));
                }
                lVarG.I();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f6498b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
                try {
                    boolean z4 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z4 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public g1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        a4.b bVar = (a4.b) this.f6499c;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            aa.c cVar = (aa.c) bVar.f113b;
            cVar.getClass();
            if (!(inputConnection instanceof g1.b)) {
                inputConnection = new g1.b((EditText) cVar.f263b, inputConnection, editorInfo);
            }
        }
        return (g1.b) inputConnection;
    }

    public void d(boolean z4) {
        g1.i iVar = (g1.i) ((aa.c) ((a4.b) this.f6499c).f113b).f264c;
        if (iVar.f4177c != z4) {
            if (iVar.f4176b != null) {
                androidx.emoji2.text.l lVarA = androidx.emoji2.text.l.a();
                g1.h hVar = iVar.f4176b;
                lVarA.getClass();
                qd.b.j(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f772a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f773b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f4177c = z4;
            if (z4) {
                g1.i.a(iVar.f4175a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z4) {
        if (drawable instanceof i0.h) {
            ((i0.i) ((i0.h) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id2 = layerDrawable.getId(i);
                    drawableArr[i] = e(layerDrawable.getDrawable(i), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f6499c) == null) {
                    this.f6499c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public z(AbsSeekBar absSeekBar) {
        this.f6498b = absSeekBar;
    }

    public z(EditText editText) {
        this.f6498b = editText;
        this.f6499c = new a4.b(editText);
    }
}
